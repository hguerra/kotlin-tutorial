package `02csvtojson`

import java.io.File

fun isNumeric(text: String): Boolean = text.toCharArray().all { it.isDigit() }

fun getElement(text: String): String {
    when {
        // items to return as they are
        text == "true" || text == "false" || text == "null" || isNumeric(text) -> return text
        // strings must be returned between double quotes
        else -> return "\"$text\""
    }
}

fun main() {
    val files = File("./input").listFiles()

    for (file in files) {
        if (file.path.endsWith(".csv")) {
            val input = file.readLines()
            val lines = input.takeLast(input.count() - 1)
            val head: List<String> = input.first().split(";")

            var text = StringBuilder("[")
            for (line in lines) {
                // get the individual CSV elements; it's not perfect, but it works
                val values = line.split(";")

                text.appendln("{")
                // walk through the elements of the CSV line
                for (i in 0 until values.count()) {
                    // convert the element in the proper JSON string
                    val element = getElement(values[i].trim())
                    // write the element to the buffer
                    // pay attention to how we write head[i]
                    text.append("\t\"${head[i]}\": $element")

                    // append a comma, except for the last element
                    if (i != values.count() - 1)
                        text.appendln(",")
                    else
                        text.appendln()
                }

                text.append("},")
            }

            // remove the last comma
            text.deleteCharAt(text.length - 1)
            // close the JSON array
            text.appendln("]")

            val newFile = file.path.replace(".csv", ".json")
            File(newFile).writeText(text.toString())
        }
    }
}

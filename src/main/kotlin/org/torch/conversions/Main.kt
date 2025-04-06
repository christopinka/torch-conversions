package org.torch.conversions.org.torch.conversions


import com.google.gson.GsonBuilder
import com.sun.org.slf4j.internal.LoggerFactory
import org.apache.poi.xslf.usermodel.XMLSlideShow
import org.apache.poi.xslf.usermodel.XSLFTextShape
import java.io.File
import java.io.FileInputStream
import java.io.FileWriter
import java.io.IOException

//private val logger = LoggerFactory.getLogger(MyLambdaHandler::class.java)

//fun handleRequest(input: String): String {
//    logger.info("Received input: $input")
//    // Function logic
//    val result = "Processed: $input"
//    logger.info("Returning result: $result")
//    return result
//}

fun main() {
    val jsonFilePath = "resources/presentation.json"
    writePrettyJsonToFile(extractTextFromSlides(), jsonFilePath)
}
fun writePrettyJsonToFile(slidesData: MutableList<Map<String, Any>>, filePath: String) {
    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(slidesData)
    println(json)
    try {
        FileWriter(filePath).use { fileWriter ->
            fileWriter.write(json)
            println("JSON data written to $filePath")
        }
    } catch (e: IOException) {
        System.err.println("An error occurred while writing to the file: " + e.message)
    }

}

fun extractTextFromSlides(): MutableList<Map<String, Any>> {
    val pptxFilePath = "resources/torch.pptx"

    val slidesData: MutableList<kotlin.collections.Map<String, Any>> = ArrayList()

    try {
        val fis: FileInputStream = FileInputStream(File(pptxFilePath))
        val ppt = XMLSlideShow(fis)
        val slideData: MutableMap<String, Any> = HashMap()

        for (slide in ppt.slides) {
            val shapesText: MutableList<String> = ArrayList()
            for (shape in slide.shapes) {
                if (shape is XSLFTextShape) {
                    shapesText.add(shape.text)
                }
            }
            slideData["texts"] = shapesText
            slidesData.add(slideData)
        }
        fis.close()

    } catch (e: IOException) {
        e.printStackTrace()
    }

    return slidesData
}



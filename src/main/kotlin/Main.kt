package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {
    val doc: Document = Jsoup
        .connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
        .get()
    // println(doc.title())
    val div = doc.select("#__next > div > section > div.sc-1vlzmga-2.dzxAnh > div:nth-child(1)")
    val article = div.select("article")
    val mainDiv = article.select("div div div")
    val numOfArrayElements = mainDiv.count()
    for(i in 0..numOfArrayElements-1){
        println(mainDiv[i].text())}

}
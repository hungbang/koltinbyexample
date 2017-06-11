package com.cheatjava.controller

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by KAI on 6/11/17.
 */
@WebServlet(name = "Home", value = "/home")
class HomeController: HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        resp?.writer?.write("Hung Bang Hello World")
    }
}
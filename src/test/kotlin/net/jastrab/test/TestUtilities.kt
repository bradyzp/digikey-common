package net.jastrab.test

import java.nio.charset.StandardCharsets

interface TestResource

inline fun <reified T: TestResource> T.loadString(resourcePath: String): String {
    return T::class.java.getResource(resourcePath).readText(charset = StandardCharsets.UTF_8)
}

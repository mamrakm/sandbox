package sk.mamrakm

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForceUserData(
    val name : String,
    val rank : String,
    val padawans : List<Padawan>,
)
data class Padawan(val name : String)
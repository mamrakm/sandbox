package sk.mamrakm

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForceUserData(
    @JsonProperty("name") val name : String,
    @JsonProperty("rank") val rank : String,
    @JsonProperty("padawans") val padawans : List<Padawan>,
)
data class Padawan(val name : String)
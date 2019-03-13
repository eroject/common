package e.project.common.exception

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * AbstractException
 * @author Iamee
 * @create 2019-03-13 22:37
 */
@JsonIgnoreProperties("cause", "stackTrace", "suppressed", "localizedMessage", ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
abstract class AbstractException : RuntimeException {

    abstract val code: Int

    constructor()

    constructor(message: String) : super(message)

}
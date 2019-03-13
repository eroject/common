package e.project.common

import com.fasterxml.jackson.annotation.JsonIgnore
import org.axonframework.modelling.command.TargetAggregateIdentifier

/**
 * e.project.common.Identifiable
 * @author Iamee
 * @create 2019-03-13 22:31
 */
interface Identifiable {

    @JsonIgnore
    @TargetAggregateIdentifier
    fun getIdentifiable(): String

}
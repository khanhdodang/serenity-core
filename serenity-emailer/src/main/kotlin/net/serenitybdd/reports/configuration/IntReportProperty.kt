package net.serenitybdd.reports.configuration

import net.thucydides.core.ThucydidesSystemProperty
import net.thucydides.core.util.EnvironmentVariables

class IntReportProperty(val property: String, val defaultValue: Int) : ReportProperty<Int> {
    constructor(property: ThucydidesSystemProperty, defaultValue: Int) : this(property.toString(), defaultValue)

    override fun configuredIn(environmentVariables: EnvironmentVariables) : Int {
        return environmentVariables.getPropertyAsInteger(property, defaultValue)
    }
}
package net.serenitybdd.reports.configuration

import net.thucydides.core.ThucydidesSystemProperty
import net.thucydides.core.util.EnvironmentVariables

class StringReportProperty(val property: String, val defaultValue: String) : ReportProperty<String> {
    constructor(property: ThucydidesSystemProperty, defaultValue: String) : this(property.toString(), defaultValue)

    override fun configuredIn(environmentVariables: EnvironmentVariables) : String {
        return environmentVariables.getProperty(property, defaultValue)
    }
}
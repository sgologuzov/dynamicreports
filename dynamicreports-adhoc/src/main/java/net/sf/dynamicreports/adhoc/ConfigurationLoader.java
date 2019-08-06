package net.sf.dynamicreports.adhoc;

import net.sf.dynamicreports.adhoc.configuration.AdhocConfiguration;
import net.sf.dynamicreports.report.exception.DRException;

/**
 * Configuration loader enables the client to save or load an instance of AdhocConfiguration
 *
 * TODO implement this interface with a web-api to save configurations via api-calls
 * TODO implement this interface with persistence-api to save configurations in a database
 * TODO implement this interface with ms-access api to save in ms access db
 */
public interface ConfigurationLoader {
    /**
     * <p>saveConfiguration.</p>
     * This method enables a client to save configuration to an XML file. Consider the folowing example
     * <pre>
     *     AdhocReport report = new AdhocReport();
     *     AdhocColumn column = new AdhocColumn();
     *     column.setName("item");
     *      report.addColumn(column);
     *
     *      column = new AdhocColumn();
     *      column.setName("quantity");
     *      report.addColumn(column);
     *  AdhocConfiguration configuration = new AdhocConfiguration();
     *  configuration.setReport(report);
     *
     *  // Now saving to an XML file in the system
     *  AdhocManager.saveConfiguration(configuration, new FileOutputStream("c:/temp/configuration.xml"));
     * </pre>
     *
     * @param adhocConfiguration a {@link net.sf.dynamicreports.adhoc.configuration.AdhocConfiguration} object.
     * @throws net.sf.dynamicreports.report.exception.DRException if any.
     */
    void saveConfiguration(AdhocConfiguration adhocConfiguration) throws DRException;

    /**
     * <p>loadConfiguration.</p>
     * This method enables a client to read {@link AdhocConfiguration} from an Input source, whether file
     * of web or dynamically generated bytestream method may be applied as shown:
     * <pre>
     *     {@code
     *        AdhocConfiguration loadedConfiguration = AdhocManager.loadConfiguration(new FileInputStream("c:/temp/configuration.xml"));
     *     }
     * </pre>
     *
     * @return a {@link AdhocConfiguration} object.
     * @throws DRException if any.
     */
    AdhocConfiguration loadConfiguration() throws DRException;
}
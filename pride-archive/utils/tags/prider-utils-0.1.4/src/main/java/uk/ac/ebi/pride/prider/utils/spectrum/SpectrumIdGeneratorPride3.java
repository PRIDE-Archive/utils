package uk.ac.ebi.pride.prider.utils.spectrum;

/**
 * Spectrum id generator for PRIDE 3
 *
 * @author Rui Wang
 * @version $Id$
 */
public class SpectrumIdGeneratorPride3 implements SpectrumIDGenerator {

    public static final String SEPARATOR = ">>";

    @Override
    public String generate(String... parts) {
        String id = "";

        for (String part : parts) {
            id += part + SEPARATOR;
        }

        return id.substring(0, id.length() - SEPARATOR.length());
    }
}

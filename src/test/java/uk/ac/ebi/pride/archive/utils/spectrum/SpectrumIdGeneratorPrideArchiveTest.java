package uk.ac.ebi.pride.archive.utils.spectrum;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/** Tests generating a spectrum ID. */
public class SpectrumIdGeneratorPrideArchiveTest {

  /** Tests generating a spectrum ID. */
  @Test
  public void testGenerate() {
    SpectrumIdGeneratorPrideArchive spectrumIdGeneratorPrideArchive =
        new SpectrumIdGeneratorPrideArchive();
    String id = spectrumIdGeneratorPrideArchive.generate("PXD000001", "file.mgf", "index=1");
    assertThat("Spectrum id doesn't match", id.equals("PXD000001;file.mgf;index=1"));
  } // todo further unit test coverage
}

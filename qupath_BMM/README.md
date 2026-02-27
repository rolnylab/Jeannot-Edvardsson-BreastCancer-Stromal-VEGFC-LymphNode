# Jeannot-Edvardsson-BreastCancer-Stromal-VEGFC-LymphNode

BMM cohort:

Color deconvolution has been applied on images with the ColorDeconvolution.groovy script

TMA dearray has been done to identify the cores on the TMA using TMA_dearray_1_2_8.groovy, TMA_dearray_3_4_5_6_7_9.groovy or TMA_dearray_10.groovy scripts depending on slide's orientation and number of cores

The cores' positions have been readjusted manually when required

Tissue coverage withing the cores has been detected with the SimpleTissueDetection.groovy script

Cell nuclei were detected using the CellDetection_AllCells.groovy script

Cells have been classified in stromal vs tumor cells and VEGFC high vs VEGFC low cells using the RunAllClassificationScript.groovy

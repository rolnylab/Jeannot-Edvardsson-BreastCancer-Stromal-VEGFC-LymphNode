if (!isTMADearrayed()) {
	runPlugin('qupath.imagej.detect.dearray.TMADearrayerPluginIJ', '{"coreDiameterMM":1.0,"labelsHorizontal":"A-L","labelsVertical":"1-3","labelOrder":"Row first","densityThreshold":5,"boundsScale":105}')
	return;
}
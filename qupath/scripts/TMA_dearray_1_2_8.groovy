if (!isTMADearrayed()) {
	runPlugin('qupath.imagej.detect.dearray.TMADearrayerPluginIJ', '{"coreDiameterMM":1.0,"labelsHorizontal":"L-A","labelsVertical":"10-1","labelOrder":"Row first","densityThreshold":5,"boundsScale":105}')
	return;
}
selectTMACores();
runPlugin('qupath.imagej.detect.tissue.SimpleTissueDetection2', '{"threshold":225,"requestedPixelSizeMicrons":5.0,"minAreaMicrons":10000.0,"maxHoleAreaMicrons":1000.0,"darkBackground":false,"smoothImage":true,"medianCleanup":true,"dilateBoundaries":false,"smoothCoordinates":true,"excludeOnBoundary":false,"singleAnnotation":false}')

DESCRIPTION = "This module is no longer recommended by the maintainer - see Capture::Tiny \
instead."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-CaptureOutput"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/IO-CaptureOutput-1.1105.tar.gz"

SRC_URI[md5sum] = "279c548c10c4dd052c07924c52a17213"
SRC_URI[sha256sum] = "ae99009fca1273800f169ecb82f4ed1cc6c76795f156bee5c0093005d572f487"

S = "${WORKDIR}/IO-CaptureOutput-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

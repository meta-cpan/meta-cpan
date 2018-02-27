DESCRIPTION = "Like Tcl's uplevel() function, but not quite so dangerous. The idea is just \
to fool caller(). All the really naughty bits of Tcl's uplevel() are \
avoided."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Uplevel"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Sub-Uplevel-0.2800.tar.gz"

SRC_URI[md5sum] = "6c6a174861fd160e8d5871a86df00baf"
SRC_URI[sha256sum] = "b4f3f63b80f680a421332d8851ddbe5a8e72fcaa74d5d1d98f3c8cc4a3ece293"

S = "${WORKDIR}/Sub-Uplevel-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

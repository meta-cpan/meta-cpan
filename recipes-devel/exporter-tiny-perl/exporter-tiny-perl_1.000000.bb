DESCRIPTION = "Exporter::Tiny supports many of Sub::Exporter's external-facing features \
including renaming imported functions with the "-as", "-prefix" and \
"-suffix" options; explicit destinations with the "into" option; and \
alternative installers with the "installer" option. But it's written in \
only about 40% as many lines of code and with zero non-core dependencies."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Exporter-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-1.000000.tar.gz"

SRC_URI[md5sum] = "0d413747bdcf880f9ec62de8801ccf5e"
SRC_URI[sha256sum] = "ffdd77d57de099e8f64dd942ef12a00a3f4313c2531f342339eeed2d366ad078"
RECOMMENDS += "test-fatal-perl-native"
RECOMMENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

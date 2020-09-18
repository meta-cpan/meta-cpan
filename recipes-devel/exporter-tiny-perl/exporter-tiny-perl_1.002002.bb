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

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-1.002002.tar.gz"

SRC_URI[md5sum] = "485897322a2514b4d6ca90b2daacb7cd"
SRC_URI[sha256sum] = "00f0b95716b18157132c6c118ded8ba31392563d19e490433e9a65382e707101"
RECOMMENDS += "test-fatal-perl-native"
RECOMMENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

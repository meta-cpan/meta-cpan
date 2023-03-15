DESCRIPTION = "Writing exporters is a pain. Some use Exporter, some use Sub::Exporter, \
some use Moose::Exporter, some use Exporter::Declare ... and some things \
are pragmas."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Import-Into"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Import-Into-1.002005.tar.gz"

SRC_URI[md5sum] = "48bdc7988f5a7d4d06039ccc5c2459e9"
SRC_URI[sha256sum] = "bd9e77a3fb662b40b43b18d3280cd352edf9fad8d94283e518181cc1ce9f0567"
RDEPENDS:${PN} += "module-runtime-perl"

S = "${WORKDIR}/Import-Into-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

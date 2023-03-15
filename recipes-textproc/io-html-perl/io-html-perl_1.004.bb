DESCRIPTION = "IO::HTML provides an easy way to open a file containing HTML while \
automatically determining its encoding. It uses the HTML5 encoding sniffing \
algorithm specified in section 8.2.2.2 of the draft standard."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-HTML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CJ/CJM/IO-HTML-1.004.tar.gz"

SRC_URI[md5sum] = "04bbe363686fd19bfb4cc0ed775e3d03"
SRC_URI[sha256sum] = "c87b2df59463bbf2c39596773dfb5c03bde0f7e1051af339f963f58c1cbd8bf5"

S = "${WORKDIR}/IO-HTML-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

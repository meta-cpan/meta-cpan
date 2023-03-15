DESCRIPTION = ""XML::Parser::PerlSAX" is a PerlSAX parser using the XML::Parser module. \
This man page summarizes the specific options, handlers, and properties \
supported by "XML::Parser::PerlSAX"; please refer to the PerlSAX standard \
in `"PerlSAX.pod"' for general usage information."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/libxml-perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KM/KMACLEOD/libxml-perl-0.08.tar.gz"

SRC_URI[md5sum] = "0ed5fbdda53d1301ddaed88db10503bb"
SRC_URI[sha256sum] = "4571059b7b5d48b7ce52b01389e95d798bf5cf2020523c153ff27b498153c9cb"
DEPENDS += "xml-parser-perl"
RDEPENDS:${PN} += "xml-parser-perl"

S = "${WORKDIR}/libxml-perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

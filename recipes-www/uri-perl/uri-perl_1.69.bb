DESCRIPTION = "This module implements the \"URI\" class. Objects of this class \
represent \"Uniform Resource Identifier references\" as specified in RFC \
2396 (and updated by RFC 2732)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/URI-1.69.tar.gz"

SRC_URI[md5sum] = "3c56aee0300bce5a440ccbd558277ea0"
SRC_URI[sha256sum] = "b74b16ea626b6f8061821bb350674c638a98be1fc766eadb24fec6635998b42d"
RRECOMMENDS_${PN} += "business-isbn-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/URI-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

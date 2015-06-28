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

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/URI-1.68.tar.gz"

SRC_URI[md5sum] = "4a954ab8d79f831616ca817ba4b26cb9"
SRC_URI[sha256sum] = "c840d30f7657bfd4b2acbb311bd764232911cd3dc97e92415fbd0a242185c358"
RRECOMMENDS_${PN} += "business-isbn-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/URI-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

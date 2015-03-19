DESCRIPTION = "NOTE: This is alpha code and liable to change while it and \
Test::WriteVariants mature."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Tumbler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Data-Tumbler-0.008.tar.gz"

SRC_URI[md5sum] = "6a58a827922a44c8e405f1907d510b02"
SRC_URI[sha256sum] = "0914f3c18df3a00295ff40d3f87e4266b5ebe922101498389a338321bbe07c8e"
DEPENDS += "test-most-perl-native"

S = "${WORKDIR}/Data-Tumbler-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

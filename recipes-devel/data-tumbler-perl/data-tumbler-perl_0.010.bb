DESCRIPTION = "NOTE: This is alpha code and liable to change while it and \
Test::WriteVariants mature."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Tumbler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Data-Tumbler-0.010.tar.gz"

SRC_URI[md5sum] = "24d7c87e952894eab95a4ba6bef42f3b"
SRC_URI[sha256sum] = "8b4f703136a0eb1226855ced051a0a2210bd794788122a9eee2eb97a5cddef96"
DEPENDS += "test-most-perl-native"

S = "${WORKDIR}/Data-Tumbler-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

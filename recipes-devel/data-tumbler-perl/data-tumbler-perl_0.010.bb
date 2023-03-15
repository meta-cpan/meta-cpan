DESCRIPTION = "NOTE: This is alpha code and liable to change while it and \
Test::WriteVariants mature."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Tumbler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Data-Tumbler-0.010.tar.gz"

SRC_URI[md5sum] = "24d7c87e952894eab95a4ba6bef42f3b"
SRC_URI[sha256sum] = "8b4f703136a0eb1226855ced051a0a2210bd794788122a9eee2eb97a5cddef96"
DEPENDS += "test-most-perl-native"

S = "${WORKDIR}/Data-Tumbler-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

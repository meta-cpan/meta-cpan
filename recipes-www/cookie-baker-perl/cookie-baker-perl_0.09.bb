DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cookie-Baker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Cookie-Baker-0.09.tar.gz"

SRC_URI[md5sum] = "972fb8746a9a9f9cf6563a16827b1af0"
SRC_URI[sha256sum] = "be020a634162b319cab55b6e2bf10556a33a210a2eee8a2f1aa1b19b5e33aa4f"
RDEPENDS_${PN} += "uri-perl"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-time-perl-native"

S = "${WORKDIR}/Cookie-Baker-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"

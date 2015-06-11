DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cookie-Baker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Cookie-Baker-0.05.tar.gz"

SRC_URI[md5sum] = "69ae3400d69762ea0e2de8a1ee2769af"
SRC_URI[sha256sum] = "28c0e2bcda793a55d77ab166e6ab6b5eb5c69c58f326d2b550f32a0b9520a98c"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-time-perl-native"
RRECOMMENDS_${PN} += "cookie-baker-xs-perl"

S = "${WORKDIR}/Cookie-Baker-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"

DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cookie-Baker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Cookie-Baker-0.06.tar.gz"

SRC_URI[md5sum] = "7b51cd44122e2a18e46e94f4f9d843f5"
SRC_URI[sha256sum] = "4b1fb173d6977af902fa018242a0b28099e5612a2fa43e0160380781f5d76ea0"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-time-perl-native"
RRECOMMENDS_${PN} += "cookie-baker-xs-perl"

S = "${WORKDIR}/Cookie-Baker-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"

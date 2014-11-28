DESCRIPTION = "This module removes body in HTTP response, if it's not required."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack-Middleware-RemoveRedundantBody"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SW/SWEETKID/Plack-Middleware-RemoveRedundantBody-0.05.tar.gz"

SRC_URI[md5sum] = "71cd1ad993f143820fe8419d90ea298c"
SRC_URI[sha256sum] = "a0676e1c792bea7f25f1d901bee59054d35012d5ea8cd42529d336143fa87cd8"
RDEPENDS_${PN} += "plack-perl"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "http-message-perl-native"

S = "${WORKDIR}/Plack-Middleware-RemoveRedundantBody-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

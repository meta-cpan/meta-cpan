DESCRIPTION = "This class is for objects that represent a \"cookie jar\" -- that is, a \
database of all the HTTP cookies that a given LWP::UserAgent object \
knows \
about."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Cookies"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Cookies-6.01.tar.gz"

SRC_URI[md5sum] = "ecfd0eeb88512033352c2f13c9580f03"
SRC_URI[sha256sum] = "f5d3ade383ce6389d80cb0d0356b643af80435bb036afd8edce335215ec5eb20"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"

S = "${WORKDIR}/HTTP-Cookies-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

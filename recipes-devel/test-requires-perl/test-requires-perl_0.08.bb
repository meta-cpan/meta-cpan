DESCRIPTION = "Test::Requires checks to see if the module can be loaded."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Requires"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Test-Requires-0.08.tar.gz"

SRC_URI[md5sum] = "339ec20fbbeaa904a968bdee629688a6"
SRC_URI[sha256sum] = "e7b1b4b30b90d530aea68205c0e65cf7a784d6a218df5a2b41830cdb404d8221"
DEPENDS += "perl"

S = "${WORKDIR}/Test-Requires-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

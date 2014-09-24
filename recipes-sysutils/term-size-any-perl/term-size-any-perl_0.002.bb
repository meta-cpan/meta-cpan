DESCRIPTION = "This is a unified interface to retrieve terminal size. It loads one \
module of a list of known alternatives, each implementing some way to \
get the \
desired terminal information. This loaded module will actually do the \
job on \
behalf of \"Term::Size::Any\"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Term-Size-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/F/FE/FERREIRA/Term-Size-Any-0.002.tar.gz"

SRC_URI[md5sum] = "f9e3fde1e494c908369dc3ce7e9b19a1"
SRC_URI[sha256sum] = "64fa5fdb1ae3a823134aaa95aec75354bc17bdd9ca12ba0a7ae34a7e51b3ded2"
RDEPENDS_${PN} += "devel-hide-perl"
RDEPENDS_${PN} += "term-size-perl-perl"

S = "${WORKDIR}/Term-Size-Any-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

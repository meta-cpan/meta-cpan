DESCRIPTION = "Given a list of Perl modules/filenames, this module makes \"require\" \
and \"use\" statements fail (no matter the specified files/modules are \
installed \
or not)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Hide"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/F/FE/FERREIRA/Devel-Hide-0.0009.tar.gz"

SRC_URI[md5sum] = "ca2ed6a23b0a3af29962986761fc1171"
SRC_URI[sha256sum] = "71dec40b9e53cd2dc98301ea4a64e1a95b71aa414f9b0d6d28c56c54f8fa16de"

S = "${WORKDIR}/Devel-Hide-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

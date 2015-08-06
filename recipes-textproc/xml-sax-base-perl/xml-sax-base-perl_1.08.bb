DESCRIPTION = "This module has a very simple task - to be a base class for PerlSAX \
drivers and filters. It's default behaviour is to pass the input directly \
to the output unchanged. It can be useful to use this module as a base \
class so you don't have to, for example, implement the characters() callback."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-SAX-Base"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GR/GRANTM/XML-SAX-Base-1.08.tar.gz"

SRC_URI[md5sum] = "38c8c3247dfd080712596118d70dbe32"
SRC_URI[sha256sum] = "666270318b15f88b8427e585198abbc19bc2e6ccb36dc4c0a4f2d9807330219e"

S = "${WORKDIR}/XML-SAX-Base-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

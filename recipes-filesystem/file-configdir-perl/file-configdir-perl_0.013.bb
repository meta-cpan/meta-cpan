DESCRIPTION = "This module is a helper for installing, reading and finding \
configuration file locations. It's intended to work in every supported \
Perl5 environment \
and will always try to Do The Right Thing(tm)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ConfigDir-0.013.tar.gz"

SRC_URI[md5sum] = "d88577cde204468a91e2466ef8302d61"
SRC_URI[sha256sum] = "e1904ebd2a06b9cda1fb2d115a198427f5bffcb1c2a2c2c3f2890e2fe7bc47bf"
RRECOMMENDS_${PN} += "list-moreutils-perl"

S = "${WORKDIR}/File-ConfigDir-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

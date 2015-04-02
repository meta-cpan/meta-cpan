DESCRIPTION = "The DBI is a database access module for the Perl programming language. \
It defines a set of methods, variables, and conventions that provide a \
consistent database interface, independent of the actual database being \
used."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TIMB/DBI-1.633.tar.gz"

SRC_URI[md5sum] = "b4fe13b9a51c1446c5f3cf93e69a2044"
SRC_URI[sha256sum] = "e2c1badcc9f672bf31630b36ecd230f7eb04dbf055e6daf7edeed0e9ebcf5ee7"

S = "${WORKDIR}/DBI-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

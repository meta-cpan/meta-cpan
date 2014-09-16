DESCRIPTION = "Yet another implementation of \"Term::Size\". Now in pure Perl, with \
the exception of a C probe run on build time."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Term-Size-Perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/F/FE/FERREIRA/Term-Size-Perl-0.029.tar.gz"

SRC_URI[md5sum] = "e647aed35b0c4973e949c311a8222dbf"
SRC_URI[sha256sum] = "8c1aaab73646ee1d233e827213ea3b5ab8afcf1d02a8f94be7aed306574875e7"

S = "${WORKDIR}/Term-Size-Perl-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

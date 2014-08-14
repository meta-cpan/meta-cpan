DESCRIPTION = "This module provides methods for obtaining information about the \
currently running perl interpreter. It originally began life as code in \
the \
\"Module::Build\" project, but has been externalized here for general \
use."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Probe-Perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/K/KW/KWILLIAMS/Probe-Perl-0.03.tar.gz"

SRC_URI[md5sum] = "8876e1b99c531800a86b383702e0ab73"
SRC_URI[sha256sum] = "d9e4d21e2e77638559045fa09046b1b6fff6c403b949929db213e30abe8a3c31"

S = "${WORKDIR}/Probe-Perl-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

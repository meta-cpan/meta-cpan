DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be *correct* and its secondary goal is to be *fast*. \
To \
reach the latter goal it was written in C."

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/JSON-XS"

LIC_FILES_CHKSUM = "unknown(unknown)"
DEPENDS += "common-sense-perl"
DEPENDS += "types-serialiser-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/JSON-XS-3.01.tar.gz"

SRC_URI[md5sum] = "b7be65295baf6dd9233c6494782c1153"
SRC_URI[sha256sum] = "4e8df3256a5aa9ed304ce1bbcd9140737deef31ba847bff9f4c15480c88c71ab"

S = "${WORKDIR}/JSON-XS-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

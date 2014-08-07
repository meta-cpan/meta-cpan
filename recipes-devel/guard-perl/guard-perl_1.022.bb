DESCRIPTION = "This module implements so-called \"guards\". A guard is something \
(usually an object) that "guards" a resource, ensuring that it is \
cleaned up when expected."

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Guard"

LIC_FILES_CHKSUM = "unknown(unknown)"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/Guard-1.022.tar.gz"

SRC_URI[md5sum] = "8d1d8b942fd5d0240f47906a6d6fac8c"
SRC_URI[sha256sum] = "35f1ba97f19a5029ecd1eba94399259592e359e0f5686aef6e758496484a5869"

S = "${WORKDIR}/Guard-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

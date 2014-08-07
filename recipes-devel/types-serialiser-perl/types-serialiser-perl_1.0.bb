DESCRIPTION = "This module provides some extra datatypes that are used by common \
serialisation formats such as JSON or CBOR. The idea is to have a \
repository \
of simple/small constants and containers that can be shared by \
different \
implementations so they become interoperable between each other."

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Types-Serialiser"

LIC_FILES_CHKSUM = "unknown(unknown)"
DEPENDS += "common-sense-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/Types-Serialiser-1.0.tar.gz"

SRC_URI[md5sum] = "76460a2bfbc644672499af89192e03fe"
SRC_URI[sha256sum] = "7ad3347849d8a3da6470135018d6af5fd8e58b4057cd568c3813695f2a04730d"

S = "${WORKDIR}/Types-Serialiser-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"

DESCRIPTION = "The Params::Validate module allows you to validate method or function \
call parameters to an arbitrary level of specificity. At the simplest \
level, it \
is capable of validating the required parameters were given and that no \
unspecified additional parameters were passed in."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-Validate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"
DEPENDS += "module-implementation-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-1.13.tar.gz"

SRC_URI[md5sum] = "51061593757a172a98ce15097e2da5d6"
SRC_URI[sha256sum] = "6aa31630329952e53e58a81d113995dfa11f786028a1c23892942598ee384be4"

S = "${WORKDIR}/Params-Validate-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan_build

BBCLASSEXTEND = "native"

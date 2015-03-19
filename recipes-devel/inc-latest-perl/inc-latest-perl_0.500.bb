DESCRIPTION = "WARNING -- THIS IS AN EXPERIMENTAL MODULE. It was originally bundled \
(as an experiment) with Module::Build and has been split out for more \
general use."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/inc-latest"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/inc-latest-0.500.tar.gz"

SRC_URI[md5sum] = "d1e0deb52bcc9f9b0f990ceb077a8ffd"
SRC_URI[sha256sum] = "daa905f363c6a748deb7c408473870563fcac79b9e3e95b26e130a4a8dc3c611"

S = "${WORKDIR}/inc-latest-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

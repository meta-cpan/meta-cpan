DESCRIPTION = "Capture::Tiny provides a simple, portable way to capture almost anything \
sent to STDOUT or STDERR, regardless of whether it comes from Perl, from XS \
code or from an external program. Optionally, output can be teed so that it \
is captured while being passed through to the original filehandles. Yes, it \
even works on Windows (usually). Stop guessing which of a dozen capturing \
modules to use in any particular situation and just use this one."

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Capture-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Capture-Tiny-0.34.tar.gz"

SRC_URI[md5sum] = "bca6ac7cd6cd88fa9cd9c99e52833a72"
SRC_URI[sha256sum] = "ee69e315817d78e7630e6083cda369ea9a100a2763396f36dcb172adb3f4f1a9"

S = "${WORKDIR}/Capture-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

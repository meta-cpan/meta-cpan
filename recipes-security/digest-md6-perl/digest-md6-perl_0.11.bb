DESCRIPTION = "The \"Digest::MD6\" module allows you to use the MD6 Message Digest \
algorithm from within Perl programs. The algorithm takes as input a message \
of arbitrary length and produces as output a \"fingerprint\" or \"message \
digest\" of the input."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-MD6"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AN/ANDYA/Digest-MD6-0.11.tar.gz \
	  file://patch-have-cc.diff \
	  "

SRC_URI[md5sum] = "7118d9bf9d7ad4db5c73e5a4f9112fc8"
SRC_URI[sha256sum] = "4360c89cbf5d81f41c67ecc0a1f8ee7b07f85bbdd81ac8a8eeb1cd0678ac796f"

S = "${WORKDIR}/Digest-MD6-${PV}"
PARALLEL_MAKE = " "

inherit cpan

BBCLASSEXTEND = "native"

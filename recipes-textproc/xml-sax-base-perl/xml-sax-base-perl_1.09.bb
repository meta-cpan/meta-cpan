DESCRIPTION = "This module has a very simple task - to be a base class for PerlSAX drivers \
and filters. It's default behaviour is to pass the input directly to the \
output unchanged. It can be useful to use this module as a base class so \
you don't have to, for example, implement the characters() callback."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-SAX-Base"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GR/GRANTM/XML-SAX-Base-1.09.tar.gz"

SRC_URI[md5sum] = "ec347a14065dd7aec7d9fb181b2d7946"
SRC_URI[sha256sum] = "66cb355ba4ef47c10ca738bd35999723644386ac853abbeb5132841f5e8a2ad0"

S = "${WORKDIR}/XML-SAX-Base-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

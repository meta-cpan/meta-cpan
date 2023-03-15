DESCRIPTION = "This module provides conflicts checking for Module::Runtime, which had a \
recent release that broke some versions of Moose. It is called from \
Moose::Conflicts and "moose-outdated"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Runtime-Conflicts"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Module-Runtime-Conflicts-0.003.tar.gz"

SRC_URI[md5sum] = "67aaf699072063cc00c5b6afd4c67a6f"
SRC_URI[sha256sum] = "707cdc75038c70fe91779b888ac050f128565d3967ba96680e1b1c7cc9733875"
RDEPENDS:${PN} += "dist-checkconflicts-perl"
RDEPENDS:${PN} += "module-runtime-perl"

S = "${WORKDIR}/Module-Runtime-Conflicts-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

DESCRIPTION = "This documentation describes the Template module which is the direct Perl \
interface into the Template Toolkit. It covers the use of the module and \
gives a brief summary of configuration options and template directives. \
Please see Template::Manual for the complete reference manual which goes \
into much greater depth about the features and use of the Template Toolkit. \
The Template::Tutorial is also available as an introductory guide to using \
the Template Toolkit."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Template-Toolkit"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Template-Toolkit-3.010.tar.gz"

SRC_URI[md5sum] = "352af62d9be343ca97a186b9255772e5"
SRC_URI[sha256sum] = "f4b65e93364088aa850887820652e467b0bce1493760fd3690268520b37d82cc"
RDEPENDS:${PN} += "appconfig-perl"
DEPENDS += "cgi-perl-native"
DEPENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Template-Toolkit-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

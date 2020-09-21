DESCRIPTION = "Date::Manip is a series of modules designed to make any common date/time \
operation easy to do. Operations such as comparing two times, determining a \
date a given amount of time from another, or parsing international times \
are all easily done. It deals with time as it is used in the Gregorian \
calendar (the one currently in use) with full support for time changes due \
to daylight saving time."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Date-Manip"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SB/SBECK/Date-Manip-6.82.tar.gz"

SRC_URI[md5sum] = "13c7600ff8a33d585b753874df85e4ea"
SRC_URI[sha256sum] = "fa96bcf94c6b4b7d3333f073f5d0faad59f546e5aec13ac01718f2e6ef14672a"
DEPENDS += "test-inter-perl-native"

S = "${WORKDIR}/Date-Manip-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
